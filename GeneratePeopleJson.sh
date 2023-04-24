#generate a json file with people data from remote api
# Path: GeneratePeopleJson.sh
curl -s https://randomuser.me/api/?results=1000 > people.json