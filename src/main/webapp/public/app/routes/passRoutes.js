angular.module('final-project').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){

    $stateProvider

    .state("pass", {

        url:"/pass",
        template: '<ui-view></ui-view>',
        resolve: {
            // Gets all customer from the database.
            getAllCustomers: ['customerService', function(customerService){

                return customerService.getAllCustomers().then(function(response){

                    return response.data;

                }, function(error){

                    console.log(error);

                });
            }],
            // Gets all vehicles from the database.
            getAllVehicles: ['vehicleService', function(vehicleService){

                return vehicleService.getVehicles().then(function(response){

                    return response.data;

                }, function(error){

                    console.log(error);

                });

            }]
        }

    })

    .state("pass.create", {

        url:"/create",
        templateUrl:"/views/pass/passCreate.html",
        controller: 'passCreateCtrl'

    })

    .state("pass.view", {

        url:"/view",
        templateUrl:"/views/pass/passView.html",
        controller: 'passViewCtrl',
        resolve: {
            // Gets all pass from the database.
            getAllPasses: ['passService', function(passService){

                return passService.getAllPasses().then(function(response){

                    return response.data;

                }, function(error){

                    console.log(error);

                });
            }]
        }
    })

    .state("pass.update", {

        url:"/update/:id",
        templateUrl: "/views/pass/passUpdate.html",
        controller: 'passUpdateCtrl',
        resolve: {
            // Get a pass by their id from the database.
            getPass: ['$stateParams', 'passService', function($stateParams, passService){

                return passService.getPass($stateParams.id).then(function(response){

                    return response.data;

                }, function(error){

                    console.log(error);

                });
            }]
        }
    });

}]);
