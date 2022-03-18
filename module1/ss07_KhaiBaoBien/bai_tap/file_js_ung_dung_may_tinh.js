function addition(){
    //thực hiện phép cộng khi click vào nút addition
    var x = Number(document.getElementById("number1").value);
    var y = Number(document.getElementById("number2").value);

    let phepcong = x + y;
    document.getElementById('result').innerHTML = (phepcong);
}

function subtraction(){
    //thực hiện phép trừ khi click vào nút subtraction
    var x = Number(document.getElementById("number1").value);
    var y = Number(document.getElementById("number2").value);

    let pheptru = x - y;
    document.getElementById('result').innerHTML = (pheptru);
}

function multip(){
    //thực hiện phép nhân khi click vào nút mutiplication
    var x = Number(document.getElementById("number1").value);
    var y = Number(document.getElementById("number2").value);

    let phepnhan = x * y;
    document.getElementById('result').innerHTML = (phepnhan);
}

function div(){
    //thực hiện phép chia khi click vào nút division
    var x = Number(document.getElementById("number1").value);
    var y = Number(document.getElementById("number2").value);

    let phepchia = x / y;
    document.getElementById('result').innerHTML = (phepchia);
}