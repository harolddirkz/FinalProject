function guardar(){
	//alert("estamos en docente")
	var nombre = $("#nombre").val();
	var apellido = $("#apellido").val();
	var dni = $("#dni").val();
	var telefono = $("#telefono").val();
	console.log(nombre+" "+apellido+" "+dni+" "+telefono);
	
	$.ajax({
		url : 'saveDocente',
		type : 'POST',
		data : {
			"nombre" : nombre,
			"apellido" : apellido,
			"dni" : dni,
			"telefono" : telefono

		},
		success : function(res) {
		
		}
	});
	
	
};