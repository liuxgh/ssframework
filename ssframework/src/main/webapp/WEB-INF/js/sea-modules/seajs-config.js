/*map start*/
seajs.production = false;
if (seajs.production) {
	seajs.config({
		map : [
				]
	});
}
/* map end */

seajs.config({
	alias : {
		"$" : "gallery/jquery/jquery-1.10.2.min.js",
		"jquery-validate" : "gallery/jquery.validate/jquery.validate.js",
		"$cookie" : "gallery/jquery.cookie/jquery.cookie.js",
		"datapicker" : "gallery/My97DatePicker/WdatePicker.js",
		"template" : "gallery/template/template.min",
		"kindeditor" : "gallery/kindeditor/4.1.10/kindeditor-min"
	}

})