angular.module('final-project').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){

    $stateProvider

    .state("vehicle", {

        url: "/vehicle",
        template: '<ui-view></ui-view>'

    })

    .state("vehicle.view", {

        url: "/view",
        templateUrl: "/views/vehicle/vehicleView.html",
        controller: "vehicleViewCtrl",
        resolve: {
            allVehicles: ['vehicleService', function(vehicleService){

                return vehicleService.getVehicles().then(function(response){

                    return response.data;

                }, function(error){

                    console.log(error);

                });

            }]
        }

    })

    .state("vehicle.create", {

        url: "/create",
        templateUrl: "views/vehicle/vehicleCreate.html",
        controller: "vehicleCreateCtrl",
        resolve : {
            // Get a list of all current makes from the database.
            makes : ['makeService', function(makeService){

                return makeService.getMakes().then(function(response){

                    response.data.push({makeName: 'Other'});

                    return response.data;

                }, function(error){

                    console.log(error);

                });
            }],
            // Get a list of all current models from the database.
            models : ['modelService', function(modelService){

                return modelService.getModels().then(function(response){

                    response.data.push({modelName: 'Other'});

                    return response.data;

                }, function(error){

                    console.log(error);

                });
            }]
        }

    })

    .state("vehicle.update", {

        url:"/update/:id",
        templateUrl: "/views/vehicle/vehicleUpdate.html",
        controller: 'vehicleUpdateCtrl',
        resolve: {
            // Get a vehicle by its id from the database.
            vehicle: ['$stateParams', 'vehicleService', function($stateParams, vehicleService){

                return vehicleService.getVehicle($stateParams.id).then(function(response){

                    return response.data;

                }, function(error){

                    console.log(error);

                });
            }],
            // Get a list of all current makes from the database.
            makes : ['makeService', function(makeService){

                return makeService.getMakes().then(function(response){

                    response.data.push({makeName: 'Other'});

                    return response.data;

                }, function(error){

                    console.log(error);

                });
            }],
            // Get a list of all current models from the database.
            models : ['modelService', function(modelService){

                return modelService.getModels().then(function(response){

                    response.data.push({modelName: 'Other'});

                    return response.data;

                }, function(error){

                    console.log(error);

                });
            }]
        }
    });

}]);
