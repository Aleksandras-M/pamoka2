window.onload = function() {

    let x = +prompt("Įveskite skaičių");

    alert(teigiamasNeigiamas(x));
    
}

function teigiamasNeigiamas(x) {

    if (x >= 0) {
        return "Skaičius yra teigiamas";
    } else {
        return "Skaičius yra neigiamas";
    }
}

