DESCRIPTION = "Server for canvas-drawing app"
LICENSE = "MIT"
LIC_FILES_CHKSUM="file://${WORKDIR}/git/LICENSE;md5=52760e101f2be22322cd81545f07e27e"

<<<<<<< HEAD
=======
RDEPENDS:${PN} +="perl"

>>>>>>> edit
SRCREV="1e0d98ddb228de9a4a86622bd2994abbcac96b65"
SRC_URI = "git://github.com/ffilipd/canvas-c-socket-server.git;protocol=http;branch=main \
"

S = "${WORKDIR}/git"

TARGET_CC_ARCH +="${LDFLAGS}"

<<<<<<< HEAD
=======

PUBLICDIR ="/home/root/public"

>>>>>>> edit
do_compile() {
    ${CC} server.c -o server
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 server ${D}${bindir}
<<<<<<< HEAD
}
=======

    install -d ${D}${PUBLICDIR}
    cp -r ${S}/public/* ${D}${PUBLICDIR}
}

FILES_${PN} += "${PUBLICDIR}"
>>>>>>> edit
