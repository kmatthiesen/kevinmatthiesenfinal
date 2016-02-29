angular.module('final-project').controller('passUpdateCtrl', ['$scope', '$state', 'passService', 'getAllCustomers', 'getAllVehicles', 'getPass',
    function($scope, $state, passService, getAllCustomers, getAllVehicles, getPass){

    $scope.vehicles = getAllVehicles;
    $scope.customers = getAllCustomers;
    $scope.pass = getPass;
    initilization();

    $scope.updatePass = function() {

        passService.update($scope.pass).then(function(){

            $scope.message = "Pass successfully updated.";
            $scope.error = "";

        }, function(error){

            $scope.error = "Error: Pass not updated.";
            $scope.message="";
            console.log(error);

        });

    };

    $scope.deletePass = function() {

        if (confirm("Are you sure you want to delete this pass?")) {

            passService.deletePass($scope.pass.passId).then(function(){

                alert("Parking Pass Deleted");
                $state.go("pass.view", {}, {reload: true});

            }, function(error) {

                $scope.error = "Error: Pass not deleted.";
                console.log(error);

            });

        }

    };

    $scope.lengthChange= function(availablePass) {

        $scope.pass.price = availablePass.price;
        $scope.pass.expirationDate = availablePass.expirationDate;
        $scope.newPass = availablePass;

    };

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

        for (var i = 0; i < $scope.availablePasses.length; i++) {

            if ($scope.pass.price == $scope.availablePasses[i].price) {

                $scope.newPass = $scope.availablePasses[i];

            }
        }
    }

}]);
