angular.module('final-project').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){

    $stateProvider

    .state("customer", {

        url:"/customer",
        template: '<ui-view></ui-view>'

    })

    .state("customer.create", {

        url:"/create",
        templateUrl:"/views/customerCreate.html",
        controller: 'customerCreateCtrl'

    })

    .state("customer.view", {

        url:"/view",
        templateUrl:"/views/customerView.html",
        controller: 'customerViewCtrl',
        resolve: {
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
        templateUrl: "/views/customerUpdate.html",
        controller: 'customerUpdateCtrl',
        resolve: {
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
