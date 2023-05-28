window.onload = function () {


    let menesis = +prompt("Įveskite mėnesio skaičių");
    let metai = +prompt("Įveskite metus");
    alert(metai + "-ujų metų " + menesis + "-o mėnesio dienų skaičius yra " + dienuSkaicius(menesis, metai));
}

function dienuSkaicius(menesis, metai) {
    let paskutineDiena;

    if (menesis === 2) {
        if (metai % 4 === 0) {
            paskutineDiena = 29;
        } else {
            paskutineDiena = 28;
        }
    } else if (menesis === 4 || menesis === 6 || menesis === 9 || menesis === 11) {
        paskutineDiena = 30;
    } else {
        paskutineDiena = 31;
    }

    return paskutineDiena;
}

