angular.module("final-project").controller("customerViewCtrl", ['$scope', 'getAllCustomers', function($scope, getAllCustomers) {

    // Initilization
    $scope.customers = getAllCustomers;

}]);
