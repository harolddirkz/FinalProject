$(document).ready(function() {
	$('#tableAlumno').DataTable({
		"language" : {
			"url" : "//cdn.datatables.net/plug-ins/1.10.19/i18n/Spanish.json"
		},

		"columnDefs" : [ {
			"targets" : [ 0 ],
			"searchable" : false
		} ]

	});

});

$(".classelegir").click(function() {

	var alumno = "";
	var idalumno = "";

	$(this).parents("tr").find(".classnombre").each(function() {
		alumno += $(this).html();
	});
	alumno += " ";
	$(this).parents("tr").find(".classapellido").each(function() {
		alumno += $(this).html();
	});

	$(this).parents("tr").find(".classidalumno").each(function() {
		idalumno += $(this).html();
	});

	$("#inputalumno").val(alumno);
	$("#idalumno").val(idalumno);
	$('#closeModal01').click();

});