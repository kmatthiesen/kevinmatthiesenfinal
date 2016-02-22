angular.module("final-project").controller("customerCtrl", ['$scope', '$state', 'customerService', 'getAllCustomers', function($scope, $state, customerService, getAllCustomers) {

    $scope.customers = getAllCustomers;

    // Creates a new customer
    $scope.createCustomer = function() {

        console.log($scope.newCustomer);

        customerService.create($scope.newCustomer).then(function(){
            console.log("Success");
        }, function(error) {
            console.log(error);
        });

    };

}]);
