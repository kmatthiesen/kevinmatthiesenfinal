angular.module("final-project").controller("vehicleViewCtrl", ['$scope', '$state', 'vehicleService', 'allVehicles',
    function($scope, $state, vehicleService, allVehicles) {

    // Initilization
    $scope.vehicles = allVehicles;

    console.log($scope.vehicles);

}]);
