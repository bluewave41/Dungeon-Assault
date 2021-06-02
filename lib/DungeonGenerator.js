const childProcess = require('child_process');

module.exports = {
    generate() {
        return new Promise((resolve, reject) => {
            childProcess.exec('java -jar lib/generate.jar', (err, stdout, stderr) => {
                console.log(err);
				let data = stdout.split('\r\n');
				data.pop();
                console.log(data);
				resolve(data.map(el => parseInt(el)));
            });
        })
    }
}