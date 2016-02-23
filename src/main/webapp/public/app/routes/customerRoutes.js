angular.module('final-project').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){

    $stateProvider

    .state("customer", {

        url:"/customer",
        template: '<ui-view></ui-view>'

    })

    .state("customer.create", {

        url:"/create",
        templateUrl:"/views/customer/customerCreate.html",
        controller: 'customerCreateCtrl'

    })

    .state("customer.view", {

        url:"/view",
        templateUrl:"/views/customer/customerView.html",
        controller: 'customerViewCtrl',
        resolve: {
            // Gets all customer from the database.
            getAllCustomers: ['customerService', function(customerService){

                return customerService.getAllCustomers().then(function(response){

                    return response.data;

                }, function(error){

                    console.log(error);

                });
            }]
        }
    })

    .state("customer.update", {
        
        url:"/update/:id",
        templateUrl: "/views/customer/customerUpdate.html",
        controller: 'customerUpdateCtrl',
        resolve: {
            // Get a customer by their id from the database.
            getCustomer: ['$stateParams', 'customerService', function($stateParams, customerService){

                return customerService.getCustomer($stateParams.id).then(function(response){

                    return response.data;

                }, function(error){

                    console.log(error);

                });
            }]
        }
    });

}]);
