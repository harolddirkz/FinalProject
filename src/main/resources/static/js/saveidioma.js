function guardar(){
	var idioma = $("#idioma").val();
	console.log(idioma);
	
	$.ajax({
		url : 'saveIdioma',
		type : 'POST',
		data : {
			"idioma" : idioma,

		},
		success : function(res) {
		
		}
	});
};
