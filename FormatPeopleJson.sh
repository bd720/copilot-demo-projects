#format people.json
# Path: FormatPeopleJson.sh
# format the json file to be more readable using python3 and jq
python -m json.tool people.json > people-formatted.json