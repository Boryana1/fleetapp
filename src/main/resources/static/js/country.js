$('document').ready(function(){

    $('table #edit-button').on('click', function(event){
        event.preventDefault();

//      this = $('table #edit-button') <a>

        var href = $(this).attr('href');

        $.get(href, function(country, status){
            console.log(country)
            $('#id-edit').val(country.id);
            $('#description-edit').val(country.description);
            $('#capital-edit').val(country.capital);
            $('#code-edit').val(country.code);
            $('#continent-edit').val(country.continent);
            $('#nationality-edit').val(country.nationality);
        });
        $('#editModal').modal();
    })

});