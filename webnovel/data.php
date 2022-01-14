<?php


    require_once('koneksi.php');

    $query = "SELECT * FROM novel";
    $sql   = mysqli_query($db_connect, $query);
    
    $result = array();
    
    if ($sql) {
        $result = array();
        while($row = mysqli_fetch_array($sql)){
            array_push($result, array(
                'id' => $row['id'],
                'judul' => $row['judul'],
                'penulis' => $row['penulis'],
            ));
        }

        echo json_encode( array('webnovel' => $result));
    }


?>
