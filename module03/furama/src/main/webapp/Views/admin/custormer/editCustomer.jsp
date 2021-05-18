<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ include file="/templates/admin/inc/header.jsp" %>
<%@ include file="/templates/admin/inc/leftbar.jsp" %>
<div id="page-wrapper">
    <div id="page-inner">
        <div class="row">
            <div class="col-md-12">
                <h2>Sửa Custormer</h2>
            </div>
        </div>
        <!-- /. ROW  -->
        <hr />
        <div class="row">
            <div class="col-md-12">
                <!-- Form Elements -->
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-md-12">
                                <form role="form" method="post" enctype="multipart/form-data" id="form">
                                    <div class="form-group">
                                        <label for="name">Họ tên</label>
                                        <input type="text" id="name" value="" name="name" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label for="name">Ngày sinh</label>
                                        <input type="text" id="birthday" value="" name="birthday" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label for="category">Giới tính</label>
                                        <select id="category" name="category" class="form-control">
	                                        <option value="1">Nam</option>
											<option value="2">Nữ</option>
                                            <option value="3">LGBT</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label for="name">Số CMND</label>
                                        <input type="text" id="socmnd" value="" name="socmnd" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label for="name">Số điện thoại</label>
                                        <input type="text" id="phone" value="" name="phone" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label for="name">Email</label>
                                        <input type="text" id="email" value="" name="email" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label for="name">Địa chỉ</label>
                                        <input type="text" id="address" value="" name="address" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label for="category">Loại khách</label>
                                        <select id="typeid" name="typeid" class="form-control">
                                            <option value="1">Diamond</option>
                                            <option value="2">Platinium</option>
                                            <option value="3">Gold</option>
                                            <option value="4">Silver</option>
                                            <option value="5">Member</option>
                                        </select>
                                    </div>
                                    <button type="submit" name="submit" class="btn btn-success btn-md">Sửa</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- End Form Elements -->
            </div>
        </div>
        <!-- /. ROW  -->
    </div>
    <!-- /. PAGE INNER  -->
</div>
<script>
    document.getElementById("").classList.add('active-menu');
</script>
<!-- /. PAGE WRAPPER  -->
<%@ include file="/templates/admin/inc/footer.jsp" %>