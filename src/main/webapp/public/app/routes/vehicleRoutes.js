angular.module('final-project').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){

    $stateProvider

    .state("vehicle", {

        url: "/vehicle",
        template: '<ui-view></ui-view>',
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

    .state("vehicle.view", {

        url: "/view",
        templateUrl: "/views/vehicle/vehicleView.html",
        controller: "vehicleViewCtrl"

    })

    .state("vehicle.create", {

        url: "/create",
        templateUrl: "views/vehicle/vehicleCreate.html",
        controller: "vehicleCreateCtrl"

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
            }]
        }
    });

}]);
