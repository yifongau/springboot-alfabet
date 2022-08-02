FROM mariadb:latest
ENV MARIADB_ALLOW_EMPTY_ROOT_PASSWORD=1

COPY create-db.sql /docker-entrypoint-initdb.d/

ENTRYPOINT ["docker-entrypoint.sh"]
CMD ["mariadbd"]

