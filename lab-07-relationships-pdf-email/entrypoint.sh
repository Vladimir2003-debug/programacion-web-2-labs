#!/bin/sh

# Esperar a que la base de datos esté lista (si usaras Postgres)
# En sqlite no es necesario, pero es buena práctica.

echo "--- 1. Generando archivos de migración (.py) ---"
python manage.py makemigrations blog --no-input

echo "--- 2. Aplicando migraciones a la base de datos ---"
python manage.py migrate --no-input

echo "--- 3. Creando Superusuario ---"
# Usamos variables de entorno que Django reconoce nativamente
export DJANGO_SUPERUSER_PASSWORD=$SUPER_USER_PASSWORD
python manage.py createsuperuser \
    --no-input \
    --username "$SUPER_USER_NAME" \
    --email "$SUPER_USER_EMAIL" || echo "El superusuario ya existe."

echo "--- 4. Iniciando servidor ---"
exec "$@"