import UserModel from 'models/User';

export default async function(req, res) {
    const users = await UserModel.query().select('username', 'renown', 'lastRaidedId');

    res.status(200).json(users);
    res.end();
}