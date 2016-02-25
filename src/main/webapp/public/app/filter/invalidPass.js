angular.module('final-project').filter('invalidPass', function(){

    return function(passDate) {

        var invalidPasses = [];
        var currentDate = new Date().getTime();

        for (var i = 0; i < passDate.length; i++) {

            if (passDate[i].expirationDate < currentDate) {

                invalidPasses.push(passDate[i]);

            }

        }

        return invalidPasses;

    };

});
