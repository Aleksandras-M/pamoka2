window.onload = function() {

    let x = +prompt("Įveskite skaičių");
    
    teigiamasNeigiamas(x);
    

}

function teigiamasNeigiamas(x) {

    if (x >= 0) {
        alert("Skaičius yra teigiamas");
    } else {
        alert("Skaičius yra neigiamas");
    }
}

