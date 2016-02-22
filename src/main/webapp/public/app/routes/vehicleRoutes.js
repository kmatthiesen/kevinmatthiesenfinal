angular.module('final-project').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){

    $stateProvider

    .state("vehicle", {

        url: "/vehicle",
        template: '<ui-view></ui-view>'

    })

    .state("vehicle.create", {

        url: "/create",
        templateUrl: "views/vehicle/vehicleCreate.html",
        controller: "vehicleCreateCtrl",
        resolve : {
            // Get a list of all current makes from the database.
            makes : ['vehicleService', function(vehicleService){

                return vehicleService.getMakes().then(function(response){

                    return response.data;

                }, function(error){

                    console.log(error);

                });
            }],
            // Get a list of all current models from the database.
            models : ['vehicleService', function(vehicleService){

                return vehicleService.getModels().then(function(response){

                    return response.data;

                }, function(error){

                    console.log(error);

                });
            }]
        }

    });

}]);
