window.onload = function(){

    let studentas = {id:1, vardasPavarde:"Vardenis Pavardenis", klase:"11B", metinisVidurkis:8 };
    console.log(studentas);
    studentasFormatuotaiAlert(studentas);
    let x = 4;
    alert(`Studento vidurkis didesnis už ${x}: ${arVidurkisDidesnis(studentas, x)}`);
    let klase = 11;
    console.log(`Ar studentas yra ${klase} klasėje: ${arYraKlase(studentas, klase)}`);
    console.log(`Studento pavardė yra ${tikPavarde(studentas)}`)
}

function studentasFormatuotaiAlert(studentas) {
    alert(`Studento ID: ${studentas.id}\nVardas Pavardė: ${studentas.vardasPavarde}\nKlasė: ${studentas.klase}\nMetinis vidurkis: ${studentas.metinisVidurkis}`)
}

function arVidurkisDidesnis(studentas, x){
    return studentas.metinisVidurkis > x;
}

function arYraKlase(studentas, x){
    return x == klasesSkaicius(studentas.klase);
}

function klasesSkaicius(x){
    let i = 0;
    let klasesSkaicius = "";
    while (i < x.length && "1234567890".includes(x[i])){
        klasesSkaicius += x[i];
        i++;
    }
    return klasesSkaicius;
}

function tikPavarde(studentas){
    let vardasPavardeAtskirti = studentas.vardasPavarde.split(" ");
    return vardasPavardeAtskirti.slice(-1);
}