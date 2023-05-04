#enter directory 'demo-slides'
cd demo-slides
#create js folder if not exist 
if [ ! -d "js" ]; then
  mkdir js
fi
#create css folder if not exist
if [ ! -d "css" ]; then
  mkdir css
fi
#download  impress.js to js folder
#wget https://raw.githubusercontent.com/impress/impress.js/master/js/impress.js -P js 
#download impress.js from cdnjs.com to js folder
#wget https://cdnjs.cloudflare.com/ajax/libs/impress.js/0.5.3/impress.js -P js
#download impress.js latest version from cdnjs.com to js folder
#wget https://cdnjs.cloudflare.com/ajax/libs/impress.js/0.6.2/impress.js -P js
#download impress.js latest version from impress.js.org to js folder
# use curl instead of wget to avoid ssl certificate error
curl https://impress.js.org/js/impress.js -o js/impress.js
# please get impress stylesheet from impress.js.org with curl
curl https://impress.js.org/css/impress-demo.css -o css/impress-demo.css
