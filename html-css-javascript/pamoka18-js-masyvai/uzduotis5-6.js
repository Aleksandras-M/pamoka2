window.onload = function () {

    const masyvas = [5, 12, 3, 6, 8, 14, 15, 5, 6, 10];
    console.log(didesnisUzDesimt(masyvas));
    let x = +prompt(`Įveskite skaičių už kurį didesniu skaičių ieškoti`)
    console.log(didesnisUzSkaiciu(masyvas, x))
}

function didesnisUzSkaiciu(masyvas, x) {
    const naujasMasyvas = [];
    for (let i = 0; i < masyvas.length; i++) {
        if (masyvas[i] > x) {
            naujasMasyvas.push(masyvas[i]);
        }
    }
    return naujasMasyvas;
}

function didesnisUzDesimt(masyvas) {
    const naujasMasyvas = [];
    for (let i = 0; i < masyvas.length; i++) {
        if (masyvas[i] > 10) {
            naujasMasyvas.push(masyvas[i]);
        }
    }
    return naujasMasyvas;
}