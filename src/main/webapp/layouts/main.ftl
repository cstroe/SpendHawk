[#ftl]
[#assign s=JspTaglibs["http://stripes.sourceforge.net/stripes.tld"]]
[@s["layout-definition"]]
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>${title}</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/webjars/Semantic-UI/${actionBean.getResource("semanticui_version")}/semantic.min.css">
</head>

<body>
[@s["layout-component"] name="pageBody"][/@]
</body>
</html>
[/@]