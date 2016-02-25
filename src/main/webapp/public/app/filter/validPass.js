angular.module('final-project').filter('validPass', function(){

    return function(passDate) {

        var validPasses = [];
        var currentDate = new Date().getTime();

        for (var i = 0; i < passDate.length; i++) {

            if (passDate[i].expirationDate >= currentDate) {

                validPasses.push(passDate[i]);

            }

        }

        return validPasses;

    };

});
