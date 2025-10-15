# NUC Homelab

Homelab testing environment

## Domain setup 

- pripoj NUC k wifi routeru cez ethernet cabel
  - nastav port forwarding pre SSH a ine
- get wifi router public IP address
  - not static, it can change - solved by DDNS
- https://noip.com
  - homelab-space41793.3utilities.com -> 188.167.59.220
- configure wifi router's DDNS settings
  - when IP is changed it notifies noip.com
- https://webglobe.sk
  - zaregistruj domenu a vytvor CNAME record
    - nuc.ultimate-homelab.online -> homelab-space41793.3utilities.com

## SSH

- wifi router port forwading only for app that should be publicly acessible
  - e.g.: frontend, backend
- ssh port forwadring for app accessible only for me using localhost
  - database, gitlab, grafana

## CI/CD

- GitLabs