DESCRIPTION = "Network UPS Tools"
LICENSE = "GPL"
DEPENDS = "libusb"
PR = "r1"

inherit autotools useradd

EXTRA_OECONF = "--with-usb --with-user=ups --with-group=nut \
		--with-systemdsystemunitdir='/etc/systemd/system' \
		--sysconfdir=/etc/ups --with-udev-dir=/etc/udev"

SRC_URI = "http://www.networkupstools.org/source/2.6/nut-${PV}.tar.gz \
	   file://nut-driver.service.in.patch \
	   "
SRC_URI[md5sum] = "e6eac4fa04baff0d0a827d64efe81a7e"
SRC_URI[sha256sum] = "618df71cf1ca6e3700d1d3c282773a2dec85f9f20324c0d3234c824e97feb93f"

LIC_FILES_CHKSUM = "file://COPYING;md5=53e0b94f340d008730893290b5b42ee4"

#S = "${WORKDIR}"

FILES_${PN} += "${datadir}/"

USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} = "nut"
USERADD_PARAM_${PN} = "-r -g nut ups"

