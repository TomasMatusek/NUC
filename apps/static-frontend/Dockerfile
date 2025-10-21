# Use official Apache image
FROM httpd:2.4

# Copy your static site content into Apache's web root
COPY ./dist/ /usr/local/apache2/htdocs/

# Optional: expose port
EXPOSE 80
