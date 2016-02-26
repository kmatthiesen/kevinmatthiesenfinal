angular.module('final-project').controller('passCreateCtrl', ['$scope', '$state', 'passService', 'getAllCustomers', 'getAllVehicles',
    function($scope, $state, passService, getAllCustomers, getAllVehicles){

    $scope.vehicles = getAllVehicles;
    $scope.customers = getAllCustomers;
    initilization();
    templatePass();

    $scope.createPass = function() {

        passService.create($scope.pass).then(function(){

            $scope.message = "Pass successfully created.";
            templatePass();

        }, function(error){

            $scope.error = "Error: Pass not created.";
            console.log(error);

        });

    };

    $scope.lengthChange= function(availablePass) {

        $scope.pass.price = availablePass.price;
        $scope.pass.expirationDate = availablePass.expirationDate;

    };

    function templatePass() {

        $scope.pass = {};
        $scope.newPass = $scope.availablePasses[1];
        $scope.pass.price = $scope.availablePasses[1].price;
        $scope.pass.expirationDate = $scope.availablePasses[1].expirationDate;

    }

    function initilization() {

        var sevenDayDate = new Date();
        sevenDayDate.setDate(sevenDayDate.getDate() + 7);
        var thirtyDayDate = new Date();
        thirtyDayDate.setDate(thirtyDayDate.getDate() + 30);
        var yearDate = new Date();
        yearDate.setDate(yearDate.getDate() + 365);

        $scope.availablePasses = [{price: 7.50, expirationDate: sevenDayDate, length: 7},
            {price: 24.99, expirationDate: thirtyDayDate, length: 30},
            {price: 225.46, expirationDate: yearDate, length: 365}
        ];

    }

}]);
