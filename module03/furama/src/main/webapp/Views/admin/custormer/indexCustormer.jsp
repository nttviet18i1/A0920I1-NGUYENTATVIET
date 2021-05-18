<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>AdminCP | VinaEnter Edu</title>
    <!-- BOOTSTRAP STYLES-->
    <link href="/resources/admin/assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="/resources/admin/assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLES-->
    <link href="/resources/admin/assets/css/custom.css" rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>

<body>
<div id="wrapper">
    <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html">CodeGym</a>
        </div>
        <div style="color: white;padding: 15px 50px 5px 50px;float: right;font-size: 16px;"> Xin chào, <b>Admin</b> &nbsp; <a href="" class="btn btn-danger square-btn-adjust">Đăng xuất</a> </div>
    </nav>
</div><nav class="navbar-default navbar-side" role="navigation">
    <div class="sidebar-collapse">
        <ul class="nav" id="main-menu">
            <li class="text-center">
                <img src="assets/img/find_user.png" class="user-image img-responsive" />
            </li>
            <li>
                <a id="index" href=""><i class="fa fa-dashboard fa-3x"></i> Trang chủ</a>
            </li>
            <li>
                <a id="services" href=""><i class="fa fa-list fa-3x"></i> Quản lý services</a>
            </li>
            <li>
                <a id="employee" href=""><i class="fa fa-music fa-3x"></i> Quản lý employee</a>
            </li>
            <li>
                <a id="contract" href=""><i class="fa fa-user fa-3x"></i> Quản lý contract</a>
            </li>
            <li>
                <a id="contractdetail" href=""><i class="fa fa-envelope fa-3x"></i> Quản lý contractdetail</a>
            </li>
        </ul>
    </div>
</nav>
<!-- /. NAV SIDE  --><div id="page-wrapper">
    <div id="page-inner">
        <div class="row">
            <div class="col-md-12">
                <h2>Quản lý Custormer</h2>
            </div>
        </div>
        <!-- /. ROW  -->
        <hr/>
        <div class="row">
            <div class="col-md-12">
                <!-- Advanced Tables -->
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="table-responsive">
                            <div class="row">
                                <div class="col-sm-6">
                                    <a href="" class="btn btn-success btn-md">Thêm</a>
                                </div>
                                <div class="col-sm-6" style="text-align: right;">
                                    <form method="post" action="">
                                        <input type="submit" name="search" value="Tìm kiếm"
                                               class="btn btn-warning btn-sm" style="float:right"/>
                                        <input type="search" class="form-control input-sm"
                                               placeholder="Nhập tên custormer" style="float:right; width: 300px;"/>
                                        <div style="clear:both"></div>
                                    </form>
                                    <br/>
                                </div>
                            </div>

                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Họ tên</th>
                                    <th>Số CMND</th>
                                    <th>Số điện thoại</th>
                                    <th>Địa chỉ</th>
                                    <th>Loại khách</th>
                                    <th width="160px">Chức năng</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td class="center"></td>
                                    <td class="center"></td>
                                    <td class="center"></td>
                                    <td class="center"></td>
                                    <td class="center"></td>
                                    <td class="center"></td>
                                    <td class="center">
                                        <a href="" title="" class="btn btn-primary"><i class="fa fa-edit "></i> Sửa</a>
                                        <a href="" title="" class="btn btn-danger"><i class="fa fa-pencil"></i> Xóa</a>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="dataTables_info" id="dataTables-example_info" style="margin-top:27px">
                                        Hiển thị từ 1 đến 5 của 10 trang
                                    </div>
                                </div>
                                <div class="col-sm-6" style="text-align: right;">
                                    <div class="dataTables_paginate paging_simple_numbers"
                                         id="dataTables-example_paginate">
                                        <ul class="pagination">
                                            <li class="paginate_button previous disabled"
                                                aria-controls="dataTables-example" tabindex="0"
                                                id="dataTables-example_previous"><a href="#">Trang trước</a></li>
                                            <li class="paginate_button active" aria-controls="dataTables-example"
                                                tabindex="0"><a href="">1</a></li>
                                            <li class="paginate_button" aria-controls="dataTables-example" tabindex="0">
                                                <a href="">2</a></li>
                                            <li class="paginate_button" aria-controls="dataTables-example" tabindex="0">
                                                <a href="">3</a></li>
                                            <li class="paginate_button" aria-controls="dataTables-example" tabindex="0">
                                                <a href="">4</a></li>
                                            <li class="paginate_button" aria-controls="dataTables-example" tabindex="0">
                                                <a href="">5</a></li>
                                            <li class="paginate_button next" aria-controls="dataTables-example"
                                                tabindex="0" id="dataTables-example_next"><a href="#">Trang tiếp</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
                <!--End Advanced Tables -->
            </div>s
        </div>
    </div>
</div>
<script>
    document.getElementById("customer").classList.add('active-menu');
</script>
<!-- /. PAGE INNER -->
</div>
<!-- /. WRAPPER  -->
<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
<!-- JQUERY -->
<script src="/resources/admin/assets/js/jquery-3.2.1.js"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script src="/resources/admin/assets/js/bootstrap.min.js"></script>
<!-- METISMENU SCRIPTS -->
<script src="/resources/admin/assets/js/jquery.metisMenu.js"></script>
<!-- CUSTOM SCRIPTS -->
<script src="/resources/admin/assets/js/custom.js"></script>
</body>
</html>