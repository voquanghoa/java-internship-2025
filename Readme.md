# Java Internship 2025

## Guide

### Create the new project
- Create new repository from github and clone the repository to your local machine
- Create new project inside the folder (alternatively you create the project first and then push it to the repository)

### Config Codecov
- Create a new Codecov account and link it to your GitHub account
- Create a new repository in Codecov and link it to the GitHub repository you just created
- Configure your new project, you should see the data is empty, just visit the Configuration tab --> General and find the token, something like below and copy it

```md
CODECOV_TOKEN=000070cd-c11f-49f0-a1ab-ac7ca9d0bf72
```

### Config the build on CircleCI
- Create the .circle/config.yml with the same content as the one in this repository, push it to the repository
- Setup the CircleCI project to use the config file you just created and build it
- The build completed failed, don't worry, open the Project Setting --> Environment variables and create new variable with name is `CODECOV_TOKEN` and the value above
- Rebuild the project, it should be successful now

### Create the badges
- Create the Readme.md file
- For CircleCI, goto project settings --> Status badges and copy the markdown code, paste it to the Readme.md file
- For Codecov, goto the repository Configuration --> Badges and Graphs --> copy the markdown code, paste it to the Readme.md file

### Test everything works
- Make a changes to the code, commit and push it to the repository
- Wait for the build completed in a few seconds, refresh the repository (it shows the file Readme.md by default), observer the changes. (sometimes, the badges take time to update)

## Badges

### Build status

[![CircleCI](https://dl.circleci.com/status-badge/img/gh/voquanghoa/java-internship-2025/tree/main.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/voquanghoa/java-internship-2025/tree/main)

### Codecov

[![codecov](https://codecov.io/gh/voquanghoa/java-internship-2025/graph/badge.svg?token=RKKS73IELY)](https://codecov.io/gh/voquanghoa/java-internship-2025)
