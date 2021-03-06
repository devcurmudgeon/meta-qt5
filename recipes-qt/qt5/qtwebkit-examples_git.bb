require qt5.inc
require qt5-git.inc

# There are no LGPLv3-only licensed files in this component.
# There are no GPLv2 licensed files in this component.
LICENSE = "GFDL-1.3 & BSD & (LGPL-2.1 & Digia-Qt-LGPL-Exception-1.1 | LGPL-3.0)"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv2;md5=05832301944453ec79e40ba3c3cfceec \
    file://LICENSE.LGPLv21;md5=58a180e1cf84c756c29f782b3a485c29 \
    file://LICENSE.LGPLv3;md5=c4fe8c6de4eef597feec6e90ed62e962 \
    file://examples/webkitwidgets/scroller/wheel/main.cpp;endline=39;md5=b0739af76072fbe303dc04b6941e054f \
    file://examples/webkitwidgets/imageanalyzer/imageanalyzer.cpp;endline=39;md5=b0739af76072fbe303dc04b6941e054f \
"

SRC_URI += " \
    file://0001-qtwebkit-examples-enable-building-examples-by-defaul.patch \
"

DEPENDS += "qtwebkit qtxmlpatterns"
RDEPENDS_${PN}-examples += "qtwebkit-qmlplugins"
RDEPENDS_${PN}-examples += "${@base_contains('PACKAGECONFIG_OPENSSL', 'openssl', 'ca-certificates', '', d)}"

SRCREV = "b7c95dc2ada1171f06183ce8608990732791aa3f"
