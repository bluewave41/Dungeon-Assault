export default async function(req, res) {
    //check if logged in
    if(!req.session.user) {
        res.status(401).json({ error: "You aren't logged in. "});
        return res.end();
    }

    //validate raider choices
    const raiders = req.body.raiders;

    //is the correct number selected?
    if(raiders.length < 0 || raiders.length > 4) {
        res.status(400).json({ error: "Invalid number of raiders received." });
        return res.end();
    }

    //slot numbers should only be from 1 to 8
    for(var i=0;i<raiders.length;i++) {
        if(raiders[i] < 1 || raiders[i] > 8) {
            res.status(400).json({ error: "Invalid slot number received. "});
            return res.end();
        }
    }

    //slot numbers are valid and correct number of raiders were selected
}