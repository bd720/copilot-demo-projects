#!/bin/bash

#define var 'api' and assign value 'https://weatherapi-com.p.rapidapi.com/current.json?q=53.1%2C-0.13'
api=https://weatherapi-com.p.rapidapi.com/current.json?q=53.1%2C-0.13
#define var 'host' and assign value 'weatherapi-com.p.rapidapi.com'
host=weatherapi-com.p.rapidapi.com
#define var 'apiKey' and assign value "400140833amshfb9a21e89780f42p166237jsnf94a97cce784
apiKey=400140833amshfb9a21e89780f42p166237jsnf94a97cce784
#define var 'contentType' and assign value 'application/octet-stream'
contentType=application/octet-stream
#use curl to get the api with all 3 headers from values above
#curl -X get # copilot not supporting this line
curl -X GET $api \
-H "x-RapidAPI-Host: $host" \
-H "X-RapidAPI-Key: $apiKey" \
-H "Content-Type: $contentType"
