<%--
  Created by IntelliJ IDEA.
  User: TienDat
  Date: 26/03/2022
  Time: 12:51 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="author" content="Muhamad Nauval Azhar">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <meta name="description" content="This is a login page template based on Bootstrap 5">
    <title>Register page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>

<body>
<section class="h-100">
    <div class="container h-100">
        <div class="row justify-content-sm-center h-100">
            <div class="col-xxl-4 col-xl-5 col-lg-5 col-md-7 col-sm-9">
                <div class="text-center my-5">
                    <img src="images/CLMCAhome.jpg" alt="logo" width="100">
                </div>
                <div class="card shadow-lg">
                    <div class="card-body p-5">
                        <h1 class="fs-4 card-title fw-bold mb-4">Đăng ký</h1>
                        <form method="post" class="needs-validation" autocomplete="off" action="signup">
                            <div class="mb-3">
                                <label class="mb-2 text-muted" for="machusan">Mã chủ sân</label>
                                <input id="machusan" type="text" class="form-control" name="machusan" value="" required autofocus>
                                <div class="invalid-feedback">
                                    vui lòng nhập đầy đủ thông tin
                                </div>
                            </div>
                            <div class="mb-3">
                                <label class="mb-2 text-muted" for="tenchusan">Tên chủ sân</label>
                                <input id="tenchusan" type="text" class="form-control" name="tenchusan" value="" required autofocus>
                                <div class="invalid-feedback">
                                    vui lòng nhập đầy đủ thông tin
                                </div>
                            </div>
                            <div class="mb-3">
                                <label class="mb-2 text-muted" for="sdt">Số điện thoại</label>
                                <input id="sdt" type="text" class="form-control" name="sdt" value="" required autofocus>
                                <div class="invalid-feedback">
                                    vui lòng nhập đầy đủ thông tin
                                </div>
                            </div>
                            <div class="mb-3">
                                <label class="mb-2 text-muted" for="diachi">Địa chỉ</label>
                                <input id="diachi" type="text" class="form-control" name="diachi" value="" required autofocus>
                                <div class="invalid-feedback">
                                    vui lòng nhập đầy đủ thông tin
                                </div>
                            </div>
                            <div class="mb-3">
                                <label class="mb-2 text-muted" for="username">Tên tài Khoản</label>
                                <input id="username" type="text" class="form-control" name="username" value="" required autofocus>
                                <div class="invalid-feedback">
                                    vui lòng nhập đầy đủ thông tin
                                </div>
                            </div>

                            <div class="mb-3">
                                <label class="mb-2 text-muted" for="password">Mật khẩu</label>
                                <input id="password" type="password" class="form-control" name="password" required>
                                <div class="invalid-feedback">
                                    vui lòng nhập đầy đủ thông tin
                                </div>
                            </div>

                            <div class="mb-3">
                                <label class="mb-2 text-muted" for="re_password">Nhập lại mật khẩu</label>
                                <input id="re_password" type="password" class="form-control" name="re_password" required>
                                <div class="invalid-feedback">
                                    vui lòng nhập đầy đủ thông tin
                                </div>
                            </div>
                            <div class="mb-3">
                                <label class="mb-2 text-muted" for="email">EMail Address</label>
                                <input id="email" type="email" class="form-control" name="email" value="" required>
                                <div class="invalid-feedback">
                                    Email is invalid
                                </div>
                            </div>

                            <p class="form-text text-muted mb-3">
                                By registering you agree with our terms and condition.
                            </p>

                            <div class="align-items-center d-flex">
                                <button type="submit" class="btn btn-primary ms-auto">
                                    Register
                                </button>
                            </div>
                        </form>
                    </div>
                    <div class="card-footer py-3 border-0">
                        <div class="text-center">
                            Already have an account? <a href="Login.jsp" class="text-dark">Login</a>
                        </div>
                    </div>
                </div>
                <div class="text-center mt-5 text-muted">
                    Copyright &copy; 2022-2023 &mdash; HUTECH
                </div>
            </div>
        </div>
    </div>
</section>

<script src="login_signup/js/login.js"></script>
</body>
</html>

