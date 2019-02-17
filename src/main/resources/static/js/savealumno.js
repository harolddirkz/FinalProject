function guardar() {
	var nombrealumno = $("#nombrealumno").val();
	var apellidoalumno = $("#apellidoalumno").val();
	var dnialumno = $("#dnialumno").val();

	console.log(nombrealumno + " " + apellidoalumno+" "+dnialumno);

	$.ajax({
		url : 'saveAlumno',
		type : 'POST',
		data : {
			"nombrealumno" : nombrealumno,
			"apellidoalumno" : apellidoalumno,
			"dnialumno" : dnialumno

		},
		success : function(res) {
		
		}
	});
};