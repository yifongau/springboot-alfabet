//GET request
fetch("/api/lemma")
    .then((response) => response.json())
    .then((lemmaAll) => {
        const listEl = document.getElementById("overzicht");

        let htmlString = "";
        lemmaAll.forEach((lemma) => {
            htmlString += template(lemma);
        });
        listEl.innerHTML = htmlString;
    });

function template(input) {
    return `
        <h2>${input.naam}</h2>
        <p>${input.beschrijving}</p>
        <p>Zie ook: <a href="${input.url}">${input.url}</a></p>
        <hr size="1" width=100%" color="black">
        
        `
}

window.sendData = function () {
    // formulierwaarden ophalen
    let rawData = new FormData();
    rawData.append("naam", document.getElementById("naam").value);
    rawData.append("beschrijving", document.getElementById("beschrijving").value);
    rawData.append("url", document.getElementById("url").value);

    // formulierwaarden omzetten in json
    const data = {};
    rawData.forEach((value, key) => (data[key] = value));

    console.log(data)

    const url = "/api/lemma";

    const options = {
        method: 'POST',
        body: JSON.stringify(data),
        headers: {
            'Content-Type': 'application/json'
        },
    };

    // Request doen
    fetch(url, options)
        .then((response) => console.log(response));
        return false;
}    
  
