var os = require('os');

var http = require('http');

var handler = function(req, res) {
    res.writeHead(200);
    res.end('hello server1 : ' + os.hostname);

}

var www = http.createServer(handler);
www.listen(9990);
