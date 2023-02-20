$('document').ready(function(){

    $('table #edit-button').on('click', function(event){
        event.preventDefault();

//      this = $('table #edit-button') <a>

        var href = $(this).attr('href');

        $.get(href, function(state, status){
            console.log(state)
            $('#id-edit').val(state.id);
            $('#name-edit').val(state.name);
            $('#capital-edit').val(state.capital);
            $('#code-edit').val(state.code);
            $('#country-edit').val(state.countryid);
//            $('#country-edit').val(state.countryid);
        });
        $('#editModal').modal();
    });

    	$('table #details-button').on('click',function(event) {
    		event.preventDefault();

    		var href= $(this).attr('href');
    		console.log(href);

    		$.get(href, function(state, status){
    		console.log("inside state status")
    			$('#id-details').val(state.id);
    			$('#name-details').val(state.name);
    			$('#capital-details').val(state.capital);
    			$('#code-details').val(state.code);
    			$('#country-details').val(state.country.description);
    		});
    		        $('#detailsModal').modal();

    		});

    $('table #delete-button').on('click', function(event){
        event.preventDefault();

        var href = $(this).attr('href')

        $('#confirm-delete-button').attr('href', href);

        $('#deleteModal').modal();
    });

});