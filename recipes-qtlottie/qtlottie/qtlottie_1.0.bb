SUMMARY = "Qt Lottie"
DESCRIPTION = "Creates a QtLottie library."

inherit qmake5 qmake5_paths

S = "${WORKDIR}/git/"

LICENSE = "(GPL-3.0 & The-Qt-Company-GPL-Exception-1.0) | The-Qt-Company-Commercial"
LIC_FILES_CHKSUM = " \
    file://${S}/LICENSE.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
    file://${S}/LICENSE.GPL3-EXCEPT;md5=763d8c535a234d9a3fb682c7ecb6c073 \
"

DEPENDS += "qtbase qtdeclarative"

FILES_${PN} += "${bindir} ${libdir}"

SRC_URI = "git://github.com/qt/qtlottie.git;branch=dev;protocol=git"
SRCREV = "03f115744229f841d42c37b1a699e9b8da7873fc"
SRC_URI[md5sum] = "7b22bdba2af35789489ff256c14dc155"

do_compile () {
    oe_runmake all
}
