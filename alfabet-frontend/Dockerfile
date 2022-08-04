FROM nginx:unprivileged
COPY ./html/ /usr/share/nginx/html/
ENTRYPOINT ["/docker-entrypoint.sh"]
EXPOSE 8080
CMD ["nginx", "-g", "daemon off;"]

