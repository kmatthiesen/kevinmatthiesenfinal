angular.module('final-project').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){

    $stateProvider

    .state("customer", {
        url:"/customer",
        templateUrl:"/views/customer.html",
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

    .state("customer.create", {
        url:"/create",
        templateUrl:"/views/customerCreate.html",
        controller: 'customerCtrl'
    })

    .state("customer.view", {
        url:"/view",
        templateUrl:"/views/customerView.html",
        controller: 'customerCtrl'
    });

}]);
