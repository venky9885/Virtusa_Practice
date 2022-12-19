function getUser() {

    setTimeout((gh) => {

        const userids = [10, 20, 30, 40];

        console.log(userids);

        setTimeout((id) => {

            const user = {

                name: 'IamNeo',

                age: 30

            };

            console.log('User ID: ${id}: User name: ${user.name} :');

            setTimeout((age) => {

                console.log(user);

            }, 1000, user.age)

        }, 1000, userids[3]);

    }, 1500);

}

getUser()