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
//            $('#country-edit').val(state.country);
            $('#country-edit').val(state.countryid);
        });
        $('#editModal').modal();
    })

    $('table #delete-button').on('click', function(event){
        event.preventDefault();

        var href = $(this).attr('href')

        $('#confirm-delete-button').attr('href', href);

        $('#deleteModal').modal();
    });

});