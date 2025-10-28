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

## CI/CD GitLabs 

- Option to deploy to different envs

## Spring Backend

- Do not inject env variables using -e to docker run, secrets are visible
  - Create .properties template and replace values by env variables
  - Place .properties file outside of docker ? Or inside to docker ? And reference it by -e parameter
    - This way password won't be presented in logs, processes ...

## Goals

### Backlog

- Have 2 different envs - prod and test
- Run setups locally, connect spring-service to PostgresDBs

### In progress

- Transfere github seret into container securelly, so it's not vissible anywhere, use .properties files

### Done

- Add choice for just build and build-and-deploy into workflowss
- Tag Docker images based on git tags and branches
  - We can run any version any time, revert version
- User different environmnets - test, prod
- Run github workflows using docker compose instead of docker command