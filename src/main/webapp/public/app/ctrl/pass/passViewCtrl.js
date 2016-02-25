angular.module("final-project").controller("passViewCtrl", ['$scope', '$state', 'getAllPasses',
    function($scope, $state, getAllPasses) {

    // Initilization
    $scope.passes = getAllPasses;

}]);
