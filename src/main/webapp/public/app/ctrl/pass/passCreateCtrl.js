angular.module('final-project').controller('passCreateCtrl', ['$scope', '$state', 'passService', 'getAllCustomers', 'getAllVehicles',
    function($scope, $state, passService, getAllCustomers, getAllVehicles){

    $scope.vehicles = getAllVehicles;
    $scope.customers = getAllCustomers;

}]);
